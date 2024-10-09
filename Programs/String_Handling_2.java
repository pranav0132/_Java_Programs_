class data{
        String name;
        data(String n)
        {
        name=n;
        }
        void disp() {
        System.out.println("Name :"+name);
        int c=0;
        int len=name.length();
        for(int i=0;i<len;i++)
        if(name.charAt(i)=='A'||name.charAt(i)=='a')
        {
        c++;
        System.out.println("number of occurence :"+c);
        System.out.println("Position :"+(i+1));
        }
        if(c==0)
        System.out.println("there is no 'A' available in the string");
        }
        }
class Exp12_2
{
    public static void main(String[] ar)
    {
        data d1=new data("Laptop");
        d1.disp();
        data d2=new data("Bottle");
        d2.disp();
    }
}
