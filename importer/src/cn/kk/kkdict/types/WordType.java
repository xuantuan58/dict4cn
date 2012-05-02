/*  Copyright (c) 2010 Xiaoyun Zhu
 * 
 *  Permission is hereby granted, free of charge, to any person obtaining a copy  
 *  of this software and associated documentation files (the "Software"), to deal  
 *  in the Software without restriction, including without limitation the rights  
 *  to use, copy, modify, merge, publish, distribute, sublicense, and/or sell  
 *  copies of the Software, and to permit persons to whom the Software is  
 *  furnished to do so, subject to the following conditions:
 *  
 *  The above copyright notice and this permission notice shall be included in  
 *  all copies or substantial portions of the Software.
 *  
 *  THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR  
 *  IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,  
 *  FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE  
 *  AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER  
 *  LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,  
 *  OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN  
 *  THE SOFTWARE.  
 */
package cn.kk.kkdict.types;

public enum WordType {
    NOUN("名", "名词"),
    VERB("动", "动词"),
    ADJECTIVE("形", "形容词"),
    ADVERB("副", "副词"),
    PREPOSITION("介", "介词"),
    PRONOUN("代", "代词"),
    CONJUNCTION("连", "连词"),
    INTERJECTION("叹", "感叹词"),
    DETERMINER("定", "定词"),
    ARTICLE("冠", "冠词"),
    NUMBER("量", "量词"),
    PHRASE("句", "句子"),
    NUMERAL("数", "数字"),
    PREFIX("前", "前缀"),
    SUFFIX("后", "后缀"),
    ABBREVIATION("缩", "缩写"),
    ANTONYM("反", "反义词"),
    SYNONYM("近", "近义词"),
    PARTICLE("助", "助词"),
    SINGULAR("单", "单数"),
    // TODO
    PARTICIPE("分", "分词"),
    PLURAL("复", "复数"),
    REFLEXIVE("自", "反身动词"), ;
    public static final String TYPE_ID = "词";
    public final String key;
    public final String name;

    WordType(String key, String name) {
        this.key = key;
        this.name = name;
    }
}