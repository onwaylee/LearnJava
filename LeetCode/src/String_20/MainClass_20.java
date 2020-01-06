/**
 * @author udady
 *LastUpdate 2020年1月4日 下午2:55:38
 */
package String_20;
/**
* @author 作者
* @version 创建时间：2020年1月4日 下午2:55:38
* 类说明
*/
import java.util.Stack;

public class MainClass_20 {
	public static void main(String[] args) {
		String s = args[0];
		boolean ans = new Solution().isValid(s);
		System.out.println(ans);
	}
}
class Solution{
	 public boolean isValid(String s) {
	        Stack<Character> stack = new Stack<>();
//	        if(s == "") {return true;}
	        if(s.equals("")) {return true;}//或s.isEmpty()
//	        if(s.charAt(0) == ')' || s.charAt(0) == ']' || s.charAt(0) == '}') { 
//        		return false;
//        	}//这种情况不处理，对于"]"下面的stack.peek()会报空栈，但是不想每次都判断栈是否为空，就拿出来单独
	        
	        for(int i = 0; i < s.length();i++) {
	        	if(s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') { //将左括号压入栈中
	        		stack.push(s.charAt(i));
	        	}
//	        	不是左括号则查看是否与栈最上层的左括号是否匹配，匹配则弹出一个左括号，继续循环
//	        	不匹配则一定是false
	        	else if(!stack.isEmpty() && isPair(stack.peek(),s.charAt(i))) {
	        		stack.pop();
	        	}
	        	else {return false;}
	        }
	        return stack.isEmpty()? true:false;
	    }
	 boolean isPair(char a,char b) {
		 return a=='('&&b==')' || a=='['&&b==']' || a=='{'&&b=='}';
	 }
}