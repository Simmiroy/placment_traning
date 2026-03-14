package DSA;

public class binary {

        public static int sq_root(int n){
            int s=0;
            int e=64;

            int ans= -1;
            while(s<=e){
                int mid=(s+e)/2;
                int square=mid*mid;
                if(square==n){
                    return mid;
                }
                else if(square>n){
                    e=mid-1;
                }
                else{
                    ans=mid;
                    s=mid+1;
                }
            }
            return ans;

        }

    public static void main(String[] args) {
        System.out.println(sq_root(64));
    }
    }

