/**
 * @author udady
 *LastUpdate 2020年1月4日 下午4:13:32
 */
package String_28;
import java.util.Scanner;
/**
* @author 作者
* @version 创建时间：2020年1月4日 下午4:13:32
* 类说明
*/
public class MainClass_28 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); // 创建Scanner对象
		try {
			System.out.print("Input haystack: "); // 打印提示
			String haystack = scanner.nextLine(); // 
			System.out.print("Input needle: "); // 打印提示
			String needle = scanner.nextLine(); // 
			int index = new Solution().strStr(haystack, needle);
			System.out.print(index);
		}
		 finally {
			 scanner.close();
		    }
        
	}
}

class Solution {
    public int strStr(String haystack, String needle) {
        //暴力解法
    	//如果后面反复计算haystack.length()会占用大量资源时间
    	int haystackLength = haystack.length();
    	int needleLength = needle.length();
    	if(needle.isEmpty()) {
    		return 0;
    	}
    	if(haystackLength - needleLength < 0) {
    		return -1;
    	}
    	int i = 0;
//    	for(; i < haystackLength - needleLength(); i++) {
    	for(; i <= haystackLength - needleLength; i++) {
//    		首先找到needle的第一个字母在haystack中的位置，假设为index
    		if(haystack.charAt(i) == needle.charAt(0)) {
    			int j = 0;
    			for(;j<needleLength;j++) {
//    				再看needle剩下的字符是否与haystack中index之后的字符是否完全匹配
    				if(haystack.charAt(i+j) != needle.charAt(j)) {break;}
    			}
    			if(j == needleLength) {return i;}
    		}
    	}
    	return -1;
    }
}