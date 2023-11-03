class NameWisePattern
{
	public static void main(String... s)
	{
		System.out.print("Enter your name, pyaare :)  => ");
		String str = new java.util.Scanner(System.in).nextLine();
		
		for(int i=0; i<str.length(); i++)
		{			
			char ch = str.charAt(i);
			//System.out.println(ch);
			
			switch(ch)
			{
				case 'A':
					LetterA la = new LetterA();
					la.showtime();
					break;
				
				case 'B':
					LetterB lb = new LetterB();
					lb.showtime();
					break;

				case 'C':
					LetterC lc = new LetterC();
					lc.showtime();
					break;

				case 'D':
					LetterD ld = new LetterD();
					ld.showtime();
					break;

				case 'E':
					LetterE le = new LetterE();
					le.showtime();
					break;

				case 'F':
					LetterF lf = new LetterF();
					lf.showtime();
					break;

				case 'G':
					LetterG lg = new LetterG();
					lg.showtime();
					break;

				case 'H':
					LetterH lh = new LetterH();
					lh.showtime();
					break;

				case 'I':
					LetterI li = new LetterI();
					li.showtime();
					break;

				case 'J':
					LetterJ lj = new LetterJ();
					lj.showtime();
					break;

				case 'K':
					LetterK lk = new LetterK();
					lk.showtime();
					break;

				case 'L':
					LetterL ll = new LetterL();
					ll.showtime();
					break;

				case 'M':
					LetterM lm = new LetterM();
					lm.showtime();
					break;

				case 'N':
					LetterN ln = new LetterN();
					ln.showtime();
					break;

				case 'O':
					LetterO lo = new LetterO();
					lo.showtime();
					break;

				case 'P':
					LetterP lp = new LetterP();
					lp.showtime();
					break;

				case 'Q':
					LetterQ lq = new LetterQ();
					lq.showtime();
					break;

				case 'R':
					LetterR lr = new LetterR();
					lr.showtime();
					break;

				case 'S':
					LetterS ls = new LetterS();
					ls.showtime();
					break;

				case 'T':
					LetterT lt = new LetterT();
					lt.showtime();
					break;

				case 'U':
					LetterU lu = new LetterU();
					lu.showtime();
					break;

				case 'V':
					LetterV lv = new LetterV();
					lv.showtime();
					break;

				case 'W':
					LetterW lw = new LetterW();
					lw.showtime();
					break;

				case 'X':
					LetterX lx = new LetterX();
					lx.showtime();
					break;

				case 'Y':
					LetterY ly = new LetterY();
					ly.showtime();
					break;

				case 'Z':
					LetterZ lz = new LetterZ();
					lz.showtime();
					break;
					
			}
		}
	}
}
	
	