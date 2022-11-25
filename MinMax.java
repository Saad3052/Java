class MinMax
{
    public static void main(String[] args)
    {
        int[] arr=new int[args.length];
        for(int i=0;i<args.length;i++)
        {
            arr[i]=Integer.parseInt(args[i]);
        }
        int min=arr[0];
        int max=arr[0];
        for(int i=0;i<args.length;i++)
        {
            System.out.print(arr[i]+" ");
            if(max>arr[i])
            {
                max=arr[i];
            }
            if(min<arr[i])
            {
                min=arr[i];
            }
        }
        System.out.println("\nMin ="+min+"\nMax = "+max);
    } 
}