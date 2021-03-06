/*
 * IndexEncoder
 *
 * Author: Lasse Collin <lasse.collin@tukaani.org>
 *
 * This file has been put into the public domain.
 * You can do whatever you want with this file.
 */

package org.tukaani.xz.index;

import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;

import org.tukaani.xz.XZIOException;
import org.tukaani.xz.common.EncoderUtil;

public class IndexEncoder extends IndexBase
{
  private final ArrayList<IndexRecord> records = new ArrayList<IndexRecord>();


  public IndexEncoder()
  {
    super(new XZIOException("XZ Stream or its Index has grown too big"));
  }


  public void add(long unpaddedSize, long uncompressedSize) throws XZIOException
  {
    super.add(unpaddedSize, uncompressedSize);
    records.add(new IndexRecord(unpaddedSize, uncompressedSize));
  }


  public void encode(OutputStream out) throws IOException
  {
    // Index Indicator
    out.write(0x00);

    // Number of Records
    EncoderUtil.encodeVLI(out, recordCount);

    // List of Records
    for (Iterator<IndexRecord> i = records.iterator(); i.hasNext();)
    {
      IndexRecord record = (IndexRecord) i.next();
      EncoderUtil.encodeVLI(out, record.unpadded);
      EncoderUtil.encodeVLI(out, record.uncompressed);
    }

    // Index Padding
    for (int i = getIndexPaddingSize(); i > 0; --i)
      out.write(0x00);
  }
}
