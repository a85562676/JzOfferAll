package code;

public class Code23_RegexMatch {

    /* 1、 当模式中第二个字符不为“*”时：若当前字符相等，则字符串和模式都后移一个字符，继续调用函数进行比较；若不相等，则返回false。
       2、 当模式中第二个字符为“*”时：若当前字符不相等，则模式后移两个字符，继续比较；若当前字符相等，则有三种情况：
         2.1 字符串字符位置不变，模式后移两个字符，继续比较；  //x*被忽略
         2.2 字符串后移一个字符，模式后移两个字符，继续比较；
         2.3 字符串后移一个字符，模式字符位置不变，继续比较。
       三种情况使用“||”进行并列比较。 */
    public static boolean match(char[] str, char[] pattern) {
        if (str == null || pattern == null)
            return false;
        return matchCore(str, 0, pattern, 0);
    }

    public static boolean matchCore(char[] str, int i, char[] pattern, int j) {
        if (i == str.length && j == pattern.length)
            return true;   //都匹配完了
        if (i < str.length && j == pattern.length)
            return false;  //模式完了，字符串还有

        if (i < str.length && (pattern[j] == str[i] || pattern[j] == '.'))
            return matchCore(str, i + 1, pattern, j + 1);

        //模式串a*a没结束，匹配串可结束可不结束
        if (j + 1 < pattern.length && pattern[j + 1] == '*') {
            if ((i < str.length && pattern[j] == '.') || (i < str.length && pattern[j] == str[i])) {
                return matchCore(str, i, pattern, j + 2) || matchCore(str, i + 1, pattern, j) || matchCore(str, i + 1, pattern, j + 2);
            } else {
                return matchCore(str, i, pattern, j + 2);
            }
        }
        return false;
    }


    public static void main(String[] args) {
        char[] str = "aaa".toCharArray();
        char[] pattern = "ab*a".toCharArray();
        boolean match = match(str, pattern);
        System.out.println(match);

    }
}
