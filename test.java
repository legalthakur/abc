class test{
    public static void method1(int a,char b){
       
        System.out.println(a+ " "+b);
    }
    public void method2(String name,double marks){
        
        System.out.println("name: "+name+ "marks: "+marks);
    }
    public static void main(String args[]){
        test obj=new test();
        obj.method2("prashant ", 12.25);
        method1(12,'a');
    }
}