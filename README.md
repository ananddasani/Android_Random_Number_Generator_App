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

![Random Number Generator App](https://user-images.githubusercontent.com/74413402/192092661-59c636fc-170b-422c-b39f-a9c2d191eb4b.png)
![Random Number Generator Code](https://user-images.githubusercontent.com/74413402/192092664-e08c8a9e-f1fc-47f6-8da2-dc35e256b45f.png)

