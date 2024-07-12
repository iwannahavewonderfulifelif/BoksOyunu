

public class Match {
Boxer b1;
Boxer b2;
int minWeight;
int maxWeight;
Match(Boxer b1,Boxer b2,int minWeight,int maxWeight){
    this.b1=b1;
    this.b2=b2;
    this.minWeight=minWeight;
    this.maxWeight=maxWeight;
}
void run(){
    if(isCheck()){
        while (this.b1.health>0 && this.b2.health>0){
            System.out.println("==========YENİ ROUND==============");
this.b2.health=this.b1.hit(this.b2);
if (isWin()){
    break;
}

this.b1.health=this.b2.hit(this.b1);
if(isWin()){
    break;
}
printScore();


        }
    }else{
        System.out.println("Sporcuların sikletleri uymuyor.");
    }
}
boolean isCheck(){
    return ((this.b1.weight>=minWeight && this.b1.weight<=maxWeight) && (this.b2.weight>=minWeight && this.b2.weight<=maxWeight)) ;
}
boolean isWin(){
    if(this.b1.health==0){
        System.out.println("Kazanan: "+this.b2.name);
        return true;
    }
    if(this.b2.health==0){
        System.out.println("Kazanan: "+this.b1.name);
        return true;
    }
    return false;
}
    public void printScore() {
        System.out.println("------------");
        System.out.println(b1.name + " Kalan Can \t:" + b1.health);
        System.out.println(b2.name + " Kalan Can \t:" + b2.health);
    }
}

