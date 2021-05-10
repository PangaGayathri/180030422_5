package wtn_practice;
public class Stringpractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//0123456789
		String s1="hi how are";//how-->(s,d)(3,6)
		//charAt is used to find the character at a particular location
				System.out.println(s1.charAt(3));	
		//length
				System.out.println(s1.length());
		//indexOf
				System.out.println(s1.indexOf('h'));
		//lastIndexOf
				System.out.println(s1.lastIndexOf('h'));
		//toUpperCase() ,toLowerCase()
				System.out.println(s1.toUpperCase()+" "+s1.toLowerCase());
		//split()
		String s="abc:def";
		String b[]=s.split(":");
		for(String x:b) {
			System.out.println(x);
		}
		//toCharArray()
		char ch[]=s.toCharArray();
		for(char x:ch) {
			System.out.println(x);
		}
		//equals()
		System.out.println(s.equals(s1));
		//compareTo()
		//s1>s2 positive s1<s2 negative s1==s2 returns 0

		String x="abcdefg";//l and f f->g g->h h->i i->j j->k k->l
		String y="abclgde";
		System.out.println(x.compareTo(y));
		//concat()
		System.out.println(x.concat(y));
		System.out.println(x+y);

		//substring()->we get a part of the string
		//substring(SI), substring(SI,DI);
		       // 0123456
		String p=" abcdefg ";
		System.out.println(p.substring(2,6));
		System.out.println(p);
		//trim()
		System.out.println(p.trim());

	}

}
