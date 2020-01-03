/**
 * @author udady
 *LastUpdate 2020年1月3日 下午5:24:10
 */
package String_13;
import java.util.Map;
import java.util.HashMap;
/**
* @author 作者
* @version 创建时间：2020年1月3日 下午5:24:10
* 类说明
*/
/**
 *
 */
public class Solution_13 {
//	实例变量
	private String s;
//	构造方法
	public Solution_13(String s) {
		this.s = s;
	}
//	实例方法，罗马数字转阿拉伯数字的逻辑
	public int romanToInt() {
        Map<String, Integer> map = new HashMap<>();
        map.put("I", 1);
        map.put("IV", 4);
        map.put("V", 5);
        map.put("IX", 9);
        map.put("X", 10);
        map.put("XL", 40);
        map.put("L", 50);
        map.put("XC", 90);
        map.put("C", 100);
        map.put("CD", 400);
        map.put("D", 500);
        map.put("CM", 900);
        map.put("M", 1000);
        
        int ans = 0;
        for(int i = 0;i < this.s.length();) {
            if(i + 1 < this.s.length() && map.containsKey(this.s.substring(i, i+2))) {
                ans += map.get(this.s.substring(i, i+2));
                i += 2;
            } else {
                ans += map.get(this.s.substring(i, i+1));
                i ++;
            }
        }
        return ans;
    }
//	测试用例
	public static void main(String[] args) {
//	从命令行读入测试数据（args[0]）的参数并传入构造方法，构建测试对象
		Solution_13 em = new Solution_13(args[0]);
		int result = em.romanToInt();
		System.out.println(result);
	}
}
