class Solution {
    static String nums[]=new String[]{
        "", "One", "Two", "Three", "Four", 
        "Five", "Six", "Seven", "Eight", "Nine"
    };
    static String ten2_19[]=new String[]{
        "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", 
        "Fifteen", "Sixteen", "Seventeen", "Eighteen", 
        "Nineteen"
    };
    static String morethan20[]=new String[]{
        "", "Ten", "Twenty", "Thirty", "Forty", 
        "Fifty", "Sixty", "Seventy", "Eighty", 
        "Ninety"
    };
    static String names[]=new String[]{"", "Thousand", "Million", "Billion"};

    public String numberToWords(int num) {
        if(num==0) return "Zero";
        String res="";
        for(int i=0;i<4 && num>0;i++){
            String v=(get(num%1000)+" "+names[i]).trim();
            if(v.equals(names[i])) v="";
            res=(v+" "+res).trim();
            num/=1000;
        }
        return res;
    }
    private String get(int num) {        
        int tensandones=num%100, hundreds=num/100;
        String res="";
        if(hundreds>0) res=nums[hundreds]+" Hundred";
        num%=100;

        if(tensandones>0) 
            res+=" "+(
                (tensandones>=10 && tensandones<=19)? 
                    ten2_19[tensandones-10]: 
                    (morethan20[tensandones/10]+" "+nums[tensandones%10]).trim()
            );

        return res.trim();
    }
}