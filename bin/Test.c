#include<stdio.h> 
#include<unistd.h> 
int main()
{
int a=fork(); 
if(a == 0)
{
printf("Child Process Created...\n");
}
else
{
printf("Parent Process Created...\n");
}
printf("Heyy There!!\n");
 return 0;
}

