public class BonusMilesService {
    public int calculate(int cost) {
        int bonus = 20;//рублей для одной бонусной мили
        cost = cost / bonus;
        return cost;
    }

}
