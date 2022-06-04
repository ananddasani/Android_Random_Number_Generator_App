# Android_Random_Number_Generator_App
Basic App to Understand Random Generation and Setting Text on TextView

This topic is a part of [My Complete Andorid Course](https://github.com/ananddasani/Android_Apps)

# Code

#### 1st Activity 
```
        button = findViewById(R.id.button);
        fetchView = findViewById(R.id.fetchRange);
        putView = findViewById(R.id.putView);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random rd = new Random();

                //fetch the range give by the user
                int range = Integer.parseInt(fetchView.getText().toString());

                //generate random number within range
                int rNumber = rd.nextInt(range);

                //put in putView
                putView.setText("Number is: " + rNumber);
            }
        });
```

# App Highlight

<img src="app_images/Random Number Generator Code.png" width="1000" /><br>

<img src="app_images/Random Number Generator App.png" width="300" /><br>
