# Reaction Game

##Part 1: Creating a New Project

- Create a new Android Project `File -> New -> New Project`
- Name it `ReactionGame`
- Set API Level to 21
- Add an Empty Activity
- Leave default `MainActivity` name

##Part 2: Create Layout

- Add 2 buttons:
- The first should be named `startButton` and be placed bottom, center on the screen
- Set the default text to `Start`
- The second should be very large, and placed near the center. Name it `mainButton`
- There should be no default text on the mainButton

##Part 3: Make It Work

- Declare variables for your startButton and endButton
- Declare 3 `long` variables, `startTime`, `endTime`, and `currentTime`
- Initialize `startButton` and `endButton`
- Set the default background color of the `mainButton` to red

```
mainButton.setBackgroundColor(Color.RED);
```

- Create on-click listeners for your startButton and mainButton
- Inside the `startButton` listener, set the start button to disabled
- Create a new post-delayed handler inside the start button listener, and make it post after a random interval between 1-3 seconds

```
Handler handler = new Handler();
handler.postDelayed(new Runnable() {
    @Override
    public void run() {
        //put other code here
    }
}, (int) (Math.random() * 3000) + 1000);
```

- Inside your run() method, set the startTime to `System.currentTimeMillis()`
- Set the background color of `mainButton` to green
- Set the text to `CLICK!`
- Set `mainButton` to enabled

- Inside the `mainButton` listener, set the endTime to `System.currentTimeMillis()`
- Set currentTime to `endTime - startTime`
- Change the background color of the mainButton to red
- Set the text on `mainButton` to the time difference calculated
- Enable the start button, disable the end button