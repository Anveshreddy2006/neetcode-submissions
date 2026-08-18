class Solution {
    public int compress(char[] chars) {
        int write = 0;
        int n = chars.length;
        int read = 0;


      
       while(read<n){
        char curr =chars[read];
        int cnt =0;

        while(read<n && curr ==chars[read]){
            read++;
            cnt++;
        } 

        chars[write++] = curr;

        if(cnt>1){
            String s = String.valueOf(cnt);

            for(char ch : s.toCharArray()){
                chars[write++] = ch;
            }
        }


      

        
       }
       return write;
    }
}