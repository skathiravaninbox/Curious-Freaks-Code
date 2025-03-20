import java.util.*;
class arrayList
{
    public static void main(String[] args)
    {
        ArrayList<String> StringArrayList=new ArrayList<>();
        StringArrayList.add("Kathir");
        StringArrayList.add("Anand");
        StringArrayList.add(1,"Dharsini");
        StringArrayList.add("Kathir");
        // for(int i=0;i<StringArrayList.size();i++)
        // {
        //     System.out.println(StringArrayList.get(i));
        // }
        boolean present=StringArrayList.contains("Kathir");
        System.out.println(present);
        int lastIndex= StringArrayList.lastIndexOf("Kathir");
        System.out.println(lastIndex); 
    }
}