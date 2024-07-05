#include<stdio.h>
#include<math.h>

void main()
{
    float a,b,c,max;
    printf("Enter Side a:");
    scanf("%f",&a);
    printf("Enter Side b:");
    scanf("%f",&b);
    printf("Enter Side c:");
    scanf("%f",&c);

if(a+b>c && b+c>a && c+a>b){
    if(a==b && a==c){
printf("Equilateral Triangle");
}
else if(a==b || b==c || a==c){
printf("Isosceles Triangle");
     }
else if(a>b && a>c){
        max=a;
    }
    else if(b>c && b>a){
        max=b;
        }
    else if(c>a && c>b){
        max=c;
        }
            if(max==a){
                if(pow(max,2)==pow(b,2)+pow(c,2)){
                    printf("Right Angle Triangle");
                }
            }
            else if(max==b){
                if(pow(max,2)==pow(a,2)+pow(c,2)){
                    printf("Right Angle Triangle");
                }
            }
            else if(max==c){
                if(pow(max,2)==pow(b,2)+pow(a,2)){
                    printf("Right Angle Triangle");
                }
                else printf("Scalane Triangle");
            }
}
else printf("Entered Sides Cannot Make a Triangle");
    

}