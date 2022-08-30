class Solution {
    public static void main (String[] args) {

        String str= "We123As1A1Team456Achieve789", nstr="";
        char ch;
        System.out.print("Original word: ");
        System.out.println("We123As1A1Team456Achieve789");
        for (int i=0; i<str.length()-25; i++)
        {
            ch= str.charAt(i);
            nstr= ch+nstr;
        }
        System.out.print("Reversed word: "+ nstr+"123");
        String n1str = "";
        for (int i=5; i<str.length()-20; i++)
        {
            ch= str.charAt(i);
            n1str= ch+n1str;
        }
        System.out.print(n1str+"1A1");
        String n2str = "";
        for (int i=10; i<str.length()-13; i++)
        {
            ch= str.charAt(i);
            n2str= ch+n2str;
        }
        System.out.print(n2str+"456");
        String n3str = "";
        for (int i=17; i<str.length()-3; i++)
        {
            ch= str.charAt(i);
            n3str= ch+n3str;
        }
        System.out.print(n3str+"789");
    }
}
  