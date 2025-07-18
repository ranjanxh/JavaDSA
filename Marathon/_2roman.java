class _2roman {
    public static int romanToInt(String s) {
        int n=s.length();
        int sum=0;
        for(int i=0;i<n;i++){
            char a=s.charAt(i);
            if(a=='I'){
                sum+=1;
            }
            else if(a=='V'){
                sum+=5;

            }
            else if(a=='X'){
                sum+=10;
                
            }else if(a=='L'){
                sum+=50;
                
            }else if(a=='C'){
                sum+=100;
                
            }else if(a=='D'){
                sum+=500;
                
            }
            else if(a=='M'){
                sum+=1000;
                
            }

        }
        return sum;
        
        
    }
}