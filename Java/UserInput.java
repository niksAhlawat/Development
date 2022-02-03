public class UserInput {
    private static String value;
    public static class TextInput {
        
        public TextInput(){
    		value= new String();
    	}
        
        public void add(char c){
           if(value.length()==0){
    			value=Character.toString(c);
    		}else{
    			value+=c;
    		}
        }
        
        public String getValue(){
            return value;
        }
    }

    public static class NumericInput extends TextInput {
        public void add(char c){ 
            if(Character.isDigit(c)){
    			
    			if(value.length()==0){
        			value=Character.toString(c);
        		}else{
        			value+=c;
        		}
    		}
        }
    }

    public static void main(String[] args) {
        TextInput input = new NumericInput();
        input.add('1');
        input.add('a');
        input.add('0');
        System.out.println(input.getValue());
    }
}