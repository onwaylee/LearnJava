/**
 * @author udady
 *LastUpdate 2020年1月4日 下午5:19:48
 */
package leetcode_11;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.Math;
//import java.math.*;
//import java.util.Scanner;
/**
* @author 作者
* @version 创建时间：2020年1月4日 下午5:19:48
* 类说明
*/
public class MainClass_11 {
    public static int[] stringToIntegerArray(String input) {
        input = input.trim();
//        System.out.println("input after trim: "+input);
        input = input.substring(1, input.length() - 1);
//        System.out.println("input after substring: "+input);
        if (input.length() == 0) {
          return new int[0];
        }
    
        String[] parts = input.split(",");
//        System.out.println("input after split: "+parts);
        int[] output = new int[parts.length];
        for(int index = 0; index < parts.length; index++) {
            String part = parts[index].trim();
            output[index] = Integer.parseInt(part);
        }
        return output;
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            int[] height = stringToIntegerArray(line);
            
            int ret = new Solution().maxArea(height);
            
            String out = String.valueOf(ret);
            
            System.out.print(out);
        }
    }
}

class Solution {
    public int maxArea(int[] height) {
        //双指针
    	//初始化：两个指针位于数组两端，最大容积：（末位-首位）*跨度
    	//因为小指针决定容积下限，固定大指针，小指针往大指针移动，才有可能找到更大容积
    	int Len = height.length;
    	int i =0;
    	int j = Len-1;
    	int cap = Math.min(height[0], height[j])*j;
    	int temp;
    	while(i!=j) {
//    		int bigger
//    		height[i] > height[j] ? j--:i++;//为什么会报错？？
    		if(height[i] > height[j]) {j--;}
    		else {i++;}
    		temp = Math.min(height[i], height[j])*(j-i);
    		if(temp > cap) {
    			cap = temp;
    		}
    	}
    	return cap;
    }
}