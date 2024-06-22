A visual method to test out the quality of Math.Rand() function in Java.<br/>

It paints each pixel of the instance of JPanel, with color value obtained using Math.rand() function. <br/>
![randomness](https://github.com/VishalRana2015/secureRNG-visualization/assets/69715143/2a8dc693-8b59-443d-ae0b-73aa5c90b17c)

<br/>
The image was painted using Math.rand() function. For each of the pixels in the above image, I painted it with RGB ( randValue, randValue, randValue), where randValue = 255*Math.rand(). Since RGB are kept to same value, so we get a shade of gray for each pixel in the frame. <br/>
In the above screenshot, as we can see there is no pattern that is being repeated. You can adjust width and height of the frame as you want. Thus, we can conclude that Math.rand() function appears to produce values that closely resembles true randomness.
