class Solution 
{
    public String convert(String s, int numRows) 
    {
        if(numRows==1) return s;
              
        char[][] result = new char[numRows][s.length()];
        
        for(int i=0; i<numRows; i++)
        {
            for(int j=0; j<s.length(); j++)
            {
                result[i][j]='\n';
            }
        }
        
        boolean direction_down=false;
        int row=0, col=0;
        
        for(int i=0; i<s.length(); i++)
        {
            
            if(row==0 || row==numRows-1) direction_down=!direction_down;
            
            result[row][col++]=s.charAt(i);
            
            if(direction_down) row++;
            else row--;
        }

        String answer="";
        for(int i=0; i<numRows; i++)
        {
            for(int j=0; j<s.length(); j++)
            {
                if(result[i][j]!='\n')
                {
                    answer+=result[i][j];
                }
            }
        }
        return answer;
        
    }
}