/**
 * @author udady
 *LastUpdate 2020年1月3日 下午5:43:11
 */
package String_12;
/**
* @author 作者
* @version 创建时间：2020年1月3日 下午5:43:11
* 类说明
*/
//通过迭代将输入的数值a写成1000*n1+900*n2+...+1*n13的形式;再根据n1~n13生成罗马数字
public class Solution_12 {
	private int _num = 1;
	private int[] ed = new int[13];
	private final int[] NUM = new int[] {1000,900,500,400,100,90,50,40,10,9,5,4,1};
	private final String[] ROMAN = new String[] {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
//	private int re = 1;
	
	public Solution_12(int num) {
		_num = num;
	}
	
	public String intToRoman() {
		String result = "";
		int i = 0;
		while(_num !=0 && i<NUM.length) {
//			System.out.print(ROMAN[i]+" "+NUM[i]+" "+_num+" ");
			ed[i] = _num/NUM[i];
			System.out.println(ROMAN[i]+" "+NUM[i]+" "+ed[i]+" "+_num);
			for(int j =0;j<ed[i];j++) {
				result += ROMAN[i];
			}
			_num = _num%NUM[i];
			i++;
		}
		return result;
	}
	
	public static void main(String[] args) {
//		从命令行输入只能用String[]，所以传入后要转型为数字
		int n = Integer.parseInt(args[0]);
		Solution_12 em = new Solution_12(n);
		String result = em.intToRoman();
		System.out.println(result);
	}
}
