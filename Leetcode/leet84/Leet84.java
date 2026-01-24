class Solution {
    private int len;
    private int[] areaArr;
    private int area;
    public int largestRectangleArea(int[] heights) {
        int width = 1;
        int totalWidth = 1;
        area = 0;
        int [] areaArr= new int[6];
        len = heights.length;
        areaArr = new int[len];
        int current = heights[0];
        int next = heights[1];
        int flag = 0;
        for(int i =0; i<=len; i++){
            for(int j = i+1; j<len; j++){
                current = heights[i];
                    next = heights[j];
                    if(current <= next){
                        if(j == i+1){
                        area =  heights[i] * totalWidth;
                        System.out.print(area+", ");

                        }
                        flag = 1;
                        totalWidth++;
                        area =  heights[i] * totalWidth;
                        System.out.print(area+", ");

                    }
                    else{
                        if(flag !=1) {
                            totalWidth = width;
                            area = heights[i] * totalWidth;
                            //totalWidth = 1;
                            System.out.print(area + ", ");
                            break;
                        }
                    }
                //System.out.print(area+", ");
                //totalWidth = 1;

            }
            totalWidth = 1;
            flag = 0;
            //System.out.print(area+", ");

        }
        return 1;
    }
}

public class Leet84{

    public static void main(String[] arg){
        int[] h = {2,1,5,6,2,3};
        Solution sob = new Solution();
        sob.largestRectangleArea(h);

    }
}