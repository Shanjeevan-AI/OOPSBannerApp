public class OOPSBannerapp {
	public static  String[] getopattern(){
		return new String[]
		              {"   ***   ",
		               " **   ** ",
	                   "**     **",
		               "**     **",
		               "**     **",
		               "**     **",
		               "**     **",
		               " **   ** ",
					   "   ***   ",};	
		}
	public static String[] getOpattern(){
		return new  String[]
		              {"   ***   ",
		               " **   ** ",
	                   "**     **",
		               "**     **",
		               "**     **",
		               "**     **",
		               "**     **",
		               " **   ** ",
	                   "   ***   ",
					   };
	}
    public static String[] getppattern(){
        return new String[]
		              {"*****     ",
		               "**   **   ",
	                   "**     ** ",
		               "**    **  ",
		               "*****     ",
		               "**        ",
		               "**        ",
		               "**        ",
					   "**        ",
					   };
	}

	public static String[] getSpattern(){	
	    return new String[]
		              {"   ***** ",
		               " **      ",
	                   "**       ",
		               " **      ",
		               "  ***    ",
		               "     **  ",
		               "       **",
		               "      ** ",
					   " *****   ",
					   };
	}
    public static void main(String[] args){
		String[] opattern =getopattern();
		String[] Opattern =getOpattern();
		String[] ppattern =getppattern();
		String[] spattern =getSpattern();
		for(int i=0; i<opattern.length; i++){
			System.out.println(opattern[i]+opattern[i]+ppattern[i]+spattern[i]);
		} 
		}	
}