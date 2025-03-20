public class Race {
    Car leader = new Car("", 0);
    int leader_distance;

    void leader_cheak(Car pretendent){
        if (pretendent.speed > this.leader.speed){
            this.leader = pretendent;
            this.leader_distance = this.leader.speed*24;
        }
    }
}
