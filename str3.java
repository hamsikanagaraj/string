class str3{
    public static void main(String args[]){
        String S="java,python,c";
        String[] arr=S.split(" , ");
        for(String lang:arr){
            System.out.println(lang);
        }
    }
    }