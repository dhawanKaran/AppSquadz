class LetterA
{
    public void showtime()
    {
        int n = 5;
        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=n; j++)
            {
                if((i==1 && j==3) || (i==2 && (j==2 || j==4)) || i==3 || (i==4 && (j==1 || j==5)) || (i==5 && (j==1 ||j==5)))
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
			System.out.println();
        }
    }
}


class LetterB
{
    public void showtime() 
    {
        int n = 5;
        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=n; j++)
            {
                if((i%2!=0 && j!=n) || (i%2==0 && (j==1 || j==n)))
					System.out.print("*");
				else
					System.out.print(" ");
            }
			System.out.println();
        }
    }
}


class LetterC
{
    public void showtime()
    {
        int n = 5;
        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=n; j++)
            {
                if((i==1 || i==n) || (i!=1 && i!=5 && j==1) )
					System.out.print("*");
				else
					System.out.print(" ");
            }
			System.out.println();
        }
    }
}


class LetterD
{
    public void showtime()
    {
        int n = 5;
        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=n; j++)
            {
                if(((i==1 || i==n) && j!=n) || (i!=1 && i!=5 && (j==1 || j==5)))
					System.out.print("*");
				else
					System.out.print(" ");
            }
			System.out.println();
        }
    }
}


class LetterE
{
    public void showtime()
    {
        int n = 5;
        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=n; j++)
            {
                if((i==1 || i==n || i==3) || (i%2==0 && j==1))
					System.out.print("*");
				else
					System.out.print(" ");
            }
			System.out.println();
        }
    }
}


class LetterF
{
    public void showtime()
    {
        int n = 5;
        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=n; j++)
            {
                if((i==1 || i==3) || ((i%2==0 || i==n) && j==1))
					System.out.print("*");
				else
					System.out.print(" ");
            }
			System.out.println();
        }
    }
}


class LetterG
{
    public void showtime()
    {
        int n = 5;
        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=n; j++)
            {
                if((i==1 || i==n) || ((i%2==0) && j==1) || (i==3 && j!=2) || (i==4 && j==5) )
					System.out.print("*");
				else
					System.out.print(" ");
            }
			System.out.println();
        }
    }
}


class LetterH
{
    public void showtime()
    {
        int n = 5;
        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=n; j++)
            {
                if((i==3) || (i!=3 && (j==1 || j==n)))
					System.out.print("*");
				else
					System.out.print(" ");
            }
			System.out.println();
        }
    }
}


class LetterI
{
    public void showtime()
    {
        int n = 5;
        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=n; j++)
            {
                if((i==1 || i==n) || (j==3 && (i!=1 || i!=n)))
					System.out.print("*");
				else
					System.out.print(" ");
            }
			System.out.println();
        }
    }
}


class LetterJ
{
    public void showtime()
    {
        int n = 5;
        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=n; j++)
            {
                if((i==1) || (j==3 && (i!=1 || i!=n)) || (i==n && j<=2))
					System.out.print("*");
				else
					System.out.print(" ");
            }
			System.out.println();
        }
    }
}


class LetterK
{
    public void showtime()
    {
        int n = 5;
        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=n; j++)
            {
                if((j==1) || (j==4 && (i==1 || i==n)) || (j==3 && i%2==0) || (i==3 && j==2))
					System.out.print("*");
				else
					System.out.print(" ");
            }
			System.out.println();
        }
    }
}


class LetterL
{
    public void showtime()
    {
        int n = 5;
        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=n; j++)
            {
                if(j==1 || i==n)
					System.out.print("*");
				else
					System.out.print(" ");
            }
			System.out.println();
        }
    }
}


class LetterM
{
    public void showtime()
    {
        int n = 5;
        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=n; j++)
            {
                if((j==1 || j==n) || (i==2 && j%2==0) || (i==3 && j==3))
					System.out.print("*");
				else
					System.out.print(" ");
            }
			System.out.println();
        }
    }
}


class LetterN
{
    public void showtime()
    {
        int n = 5;
        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=n; j++)
            {
                if((j==1 || j==n) || /*(i==2 && j==2) || (i==3 && j==3) || (i==4 && j==4)*/ (i!=1 && i!=n && i==j))
					System.out.print("*");
				else
					System.out.print(" ");
            }
			System.out.println();
        }
    }
}


class LetterO
{
    public void showtime()
    {
        int n = 5;
        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=n; j++)
            {
                if((j==1 || j==n) || (i==1 || i==n))
					System.out.print("*");
				else
					System.out.print(" ");
            }
			System.out.println();
        }
    }
}


class LetterP
{
    public void showtime()
    {
        int n = 5;
        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=n; j++)
            {
                if((i==1 || i==3) || (j==1) || (i==2 && j==5) )
					System.out.print("*");
				else
					System.out.print(" ");
            }
			System.out.println();
        }
    }
}


class LetterQ
{
    public void showtime()
    {
        int n = 5;
        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=n; j++)
            {
                if((i==1 || i==4) || (j==5) || (i<=4 && j==1) || (i==3 && j==4) )
					System.out.print("*");
				else
					System.out.print(" ");
            }
			System.out.println();
        }
    }
}


class LetterR
{
    public void showtime()
    {
        int n = 5;
        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=n; j++)
            {
                if((i==1 || i==3) || (j==1) || (i==2 && j==5) || (i==4 && j==3) || (i==5 && j==4))
					System.out.print("*");
				else
					System.out.print(" ");
            }
			System.out.println();
        }
    }
}


class LetterS
{
    public void showtime()
    {
        int n = 5;
        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=n; j++)
            {
                if((i==1 || i==3 || i==n) || (i==2 && j==1) || (i==4 && j==5) )
					System.out.print("*");
				else
					System.out.print(" ");
            }
			System.out.println();
        }
    }
}


class LetterT
{
    public void showtime()
	{
        int n = 5;
        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=n; j++)
            {
                if(i==1 || j==3 )
					System.out.print("*");
				else
					System.out.print(" ");
            }
			System.out.println();
        }
    }
}


class LetterU
{
    public void showtime() 
    {
        int n = 5;
        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=n; j++)
            {
                if(i==n || j==1 || j==n)
					System.out.print("*");
				else
					System.out.print(" ");
            }
			System.out.println();
        }
    }
}


class LetterV
{
    public void showtime()
    {
        int n = 5;
        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=n; j++)
            {
                if(((j==1 || j==n) && i<=3) || (i==4 && j%2==0) || (i==n && j==3))
					System.out.print("*");
				else
					System.out.print(" ");
            }
			System.out.println();
        }
    }
}


class LetterW
{
    public void showtime()
    {
        int n = 5;
        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=n; j++)
            {
                if((j==1 || j==n) || (i==4 && j%2==0) || (i==3 && j==3) )
					System.out.print("*");
				else
					System.out.print(" ");
            }
			System.out.println();
        }
    }
}


class LetterX
{
    public void showtime()
    {
        int n = 5;
        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=n; j++)
            {
                if(i==j || j==n-i+1 )
					System.out.print("*");
				else
					System.out.print(" ");
            }
			System.out.println();
        }
    }
}


class LetterY
{
    public void showtime()
    {
        int n = 5;
        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=n; j++)
            {
                if((i==1 && (j==1 || j==n)) || (i==2 & j%2==0) || (i>=3 && j==3) )
					System.out.print("*");
				else
					System.out.print(" ");
            }
			System.out.println();
        }
    }
}


class LetterZ
{
    public void showtime()
    {
        int n = 5;
        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=n; j++)
            {
                if(i==1 || i==n || j==n-i+1 )
					System.out.print("*");
				else
					System.out.print(" ");
            }
			System.out.println();
        }
    }
}