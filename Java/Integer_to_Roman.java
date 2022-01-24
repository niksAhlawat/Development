import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Integer_to_Roman {
    public static void main(String[] args) {
        int num = 1;
        // Naive Method
        System.out.println(solve(num));

        // Using Arrays
        System.out.println(intToRoman(num));

        // Optimised Using TreeMap
        System.out.println(integerToRomanOptimsed(num));
    }

    private static final Map<Integer,String> mapRoman = new HashMap<Integer, String>();
    
    static{
        mapRoman.put(1000, "M");
        mapRoman.put(900, "CM");
        mapRoman.put(500, "D");
        mapRoman.put(400, "CD");
        mapRoman.put(100, "C");
        mapRoman.put(90, "XC");
        mapRoman.put(50, "L");
        mapRoman.put(40, "XL");
        mapRoman.put(10, "X");
        mapRoman.put(9, "IX");
        mapRoman.put(5, "V");
        mapRoman.put(4, "IV");
        mapRoman.put(1, "I");
    };

// 1234 MCCXXXIV
    private static String solve (int n) {
        StringBuilder result = new StringBuilder();
        while(n>0){
            if(n >= 1000){
                result.append(mapRoman.get(1000));
                n = n-1000;;
            } else if(n>=900){
                result.append(mapRoman.get(900));
                n = n-900;;
            }else if(n>=500){
                result.append(mapRoman.get(500));
                n = n-500;;
            }else if(n>=400){
                result.append(mapRoman.get(400));
                n = n-400;;
            }else if(n>=100){
                result.append(mapRoman.get(100));
                n = n-100;;
            }else if(n>=90){
                result.append(mapRoman.get(90));
                n = n-90;;
            }else if(n>=50){
                result.append(mapRoman.get(50));
                n = n-50;;
            }else if(n>=10){
                result.append(mapRoman.get(10));
                n = n-10;;
            }else if(n>=9){
                result.append(mapRoman.get(9));
                n = n-9;;
            }else if(n>=5){
                result.append(mapRoman.get(5));
                n = n-5;;
            }else if(n>=4){
                result.append(mapRoman.get(4));
                n = n-4;;
            }else if(n>=1){
                result.append(mapRoman.get(1));
                n = n-1;;
            } else{
                n = 0;
            }
    }
        return result.toString();
    }

    private static String  intToRoman(int num) {
        int[] values = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] romanLiterals = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};

        StringBuilder roman = new StringBuilder();

        for(int i=0;i<values.length;i++) {
            while(num >= values[i]) {
                num = num- values[i];
                roman.append(romanLiterals[i]);
            }
        }
        
        return roman.toString();
    }


    

    // Using TreeMap
    private static final TreeMap<Integer, String> treemap = new TreeMap<Integer, String>();
    static{
	treemap.put(1000, "M");
	treemap.put(900, "CM");
	treemap.put(500, "D");
	treemap.put(400, "CD");
	treemap.put(100, "C");
	treemap.put(90, "XC");
	treemap.put(50, "L");
	treemap.put(40, "XL");
	treemap.put(10, "X");
	treemap.put(9, "IX");
	treemap.put(5, "V");
	treemap.put(4, "IV");
	treemap.put(1, "I");
};

public static final String integerToRomanOptimsed(int number) {
	int i = treemap.floorKey(number);
    System.out.println("Floor Key: "+  i);
	if (number == i) {
		return treemap.get(number);
	}
	return treemap.get(i) + integerToRomanOptimsed(number - i);
}


}
