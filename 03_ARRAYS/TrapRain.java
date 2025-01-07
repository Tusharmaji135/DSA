public class TrapRain {

  public static int trappedRainWater(int height[]){
    int n = height.length;
    //calc left max boundry - array
    int leftMax[] = new int[n];
    leftMax[0] = height[0];
    for (int i = 1; i < n; i++) {
      leftMax[i] = Math.max(height[i], leftMax[i-1]);
    }
    //calc Right max boundry - array
    int rightMax[] = new int[n];
    rightMax[n - 1] = height[n - 1];
    for (int i = n-2; i >= 0; i--) {
      rightMax[i] = Math.max(height[i], rightMax[i+1]);
    }

    int trappedWater = 0;
    //loop
    for (int i = 0; i < n; i++) {
      //waterLavel = min(left max boundry,Right max boundry)
      int waterLavel = Math.min(leftMax[i], rightMax[i]);
      //trapped water = waterLAvel - height[i]
      trappedWater += waterLavel - height[i];
    }

    return trappedWater;

  }
  public static void main(String[] args) {
    int height[] = {4,2,0,6,3,2,5};
    int trappedWater = trappedRainWater(height);
    System.out.println("Trapped Water : "+trappedWater );
  }


}
