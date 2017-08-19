/**
 *题目信息：
 * 请实现一个函数，将一个字符串中的空格替换成“%20”。
 * 例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
 *
 * 主要思路：Java有字符替换的API,调用就行
 *
 * Created by V-zar on 2017/8/19.
 */
public class Solution_02 {

    public String replaceSpace(StringBuffer str) {
        String s = str.toString();
        s = s.replaceAll(" ","%20");

        return s;
    }
}
