package com.example.tom.myfirstapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.HapticFeedbackConstants;
import android.view.View;
import android.view.Menu;
import android.widget.Button;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    //Boolean that keeps track if the user has just hit the clear button on the application. This is used to restrict unwanted inputs.
    private boolean cleared;
    //Boolean that keeps track if the user has just hit the percentage button on the application. This is used to restrict unwanted inputs.
    private boolean percentage = false;
    private Button tview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        cleared = true;
        //Creating instances of all calculator buttons.
        Button one = findViewById(R.id.one);
        Button two = findViewById(R.id.two);
        Button three = findViewById(R.id.three);
        Button four = findViewById(R.id.four);
        Button five = findViewById(R.id.five);
        Button six = findViewById(R.id.six);
        Button seven = findViewById(R.id.seven);
        Button eight = findViewById(R.id.eight);
        Button nine = findViewById(R.id.nine);
        Button zero = findViewById(R.id.zero);
        Button clear = findViewById(R.id.c);
        Button decimal = findViewById(R.id.decimal);
        Button mult = findViewById(R.id.mult);
        Button divide = findViewById(R.id.divide);
        Button inv = findViewById(R.id.inverse);
        Button plus = findViewById(R.id.plus);
        Button minus = findViewById(R.id.minus);
        Button equal = findViewById(R.id.equal);
        Button sqrtt = findViewById(R.id.sqrt);
        Button flip = findViewById(R.id.sign);
        Button undo = findViewById(R.id.und);
        Button percent = findViewById(R.id.percent);

        //Text view for where result is placed.
        tview = findViewById(R.id.tview);

        //Listener for one button press.
        //This listener concatenates one to the current input if possible.
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            if(!percentage) {
                if (cleared) {
                    tview.setText("");
                    cleared = false;
                }
                tview.setText(String.format("%s1", tview.getText()));
            }
            }
        });

        //Listener for two button press.
        //This listener concatenates two to the current input if possible.
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!percentage) {
                    if (cleared) {
                        tview.setText("");
                        cleared = false;
                    }
                    tview.setText(String.format("%s2", tview.getText()));
                }
            }
        });

        //Listener for three button press.
        //This listener concatenates three to the current input if possible.
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!percentage) {
                if(cleared){
                    tview.setText("");
                    cleared = false;
                }
                tview.setText(String.format("%s3", tview.getText()));
            }
            }

        });

        //Listener for four button press.
        //This listener concatenates four to the current input if possible.
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!percentage) {
                    if (cleared) {
                        tview.setText("");
                        cleared = false;
                    }
                    tview.setText(String.format("%s4", tview.getText()));
                }
            }
        });

        //Listener for five button press.
        //This listener concatenates five to the current input if possible.
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!percentage) {
                    if (cleared) {
                        tview.setText("");
                        cleared = false;
                    }
                    tview.setText(String.format("%s5", tview.getText()));
                }
            }
        });

        //Listener for six button press.
        //This listener concatenates six to the current input if possible.
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!percentage) {
                    if (cleared) {
                        tview.setText("");
                        cleared = false;
                    }
                    tview.setText(String.format("%s6", tview.getText()));
                }
            }
        });

        //Listener for seven button press.
        //This listener concatenates seven to the current input if possible.
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!percentage) {
                    if (cleared) {
                        tview.setText("");
                        cleared = false;
                    }
                    tview.setText(String.format("%s7", tview.getText()));
                }
            }
        });

        //Listener for eight button press.
        //This listener concatenates eight to the current input if possible.
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!percentage) {
                    if (cleared) {
                        tview.setText("");
                        cleared = false;
                    }
                    tview.setText(String.format("%s8", tview.getText()));
                }
            }
        });

        //Listener for nine button press.
        //This listener concatenates nine to the current input if possible.
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!percentage) {
                    if (cleared) {
                        tview.setText("");
                        cleared = false;
                    }
                    tview.setText(String.format("%s9", tview.getText()));
                }
            }
        });

        //Listener for zero button press.
        //This listener concatenates zero to the current input if possible.
        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!percentage) {
                    if (!cleared) tview.setText(String.format("%s0", tview.getText()));
                }
            }
        });

        //Listener for clear button press.
        //This listener clears the current input operand and all setting the input to zero.
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tview.setText("0");
                cleared = true;
            }
        });

        /*
        Listener for divide button press. This listener concatenates the divide operand to the
        current input if possible. If the most recent char is an operand the button replaces the
        character with the divide operator. If there is already a valid equation in the input that
         equation is first equated and the answer is then followed by the divide operator.
        */
        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(cleared) cleared = false;
                int lastChar = tview.getText().charAt(tview.getText().length()-1);
                int firstChar = tview.getText().charAt(0);
                String eq;
                if(firstChar == 45)
                    eq = tview.getText().toString().substring(1, tview.getText().length());
                else eq = tview.getText().toString();
                if(lastChar == 47 || lastChar == 45 || lastChar == 43 || lastChar == 42)
                    tview.setText(tview.getText().subSequence(0, tview.getText().length() - 1));
                else if(eq.contains("*") || eq.contains("/") || eq.contains("+")||eq.contains("-"))
                    equalz(tview.getText());
                tview.setText(String.format("%s/", tview.getText()));
            }
        });

        /*
        Listener for minus button press. This listener concatenates the minus operand to the
        current input if possible. If the most recent char is an operand the button replaces the
        character with the minus operator. If there is already a valid equation in the input that
         equation is first equated and the answer is then followed by the minus operator.
        */
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(cleared) cleared = false;
                int lastChar = tview.getText().charAt(tview.getText().length()-1);
                int firstChar = tview.getText().charAt(0);
                String eq;
                if(firstChar == 45)
                    eq = tview.getText().toString().substring(1, tview.getText().length());
                else eq = tview.getText().toString();
                if(lastChar == 47 || lastChar == 45 || lastChar == 43 || lastChar == 42)
                    tview.setText(tview.getText().subSequence(0, tview.getText().length() - 1));
                else if(eq.contains("*") || eq.contains("/") || eq.contains("+")||eq.contains("-"))
                    equalz(tview.getText());
                tview.setText(String.format("%s-", tview.getText()));
            }
        });

        /*
        Listener for plus button press. This listener concatenates the plus operand to the
        current input if possible. If the most recent char is an operand the button replaces the
        character with the plus operator. If there is already a valid equation in the input that
         equation is first equated and the answer is then followed by the plus operator.
        */
        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(cleared) cleared = false;
                int lastChar = tview.getText().charAt(tview.getText().length()-1);
                int firstChar = tview.getText().charAt(0);
                String eq;
                if(firstChar == 45)
                    eq = tview.getText().toString().substring(1, tview.getText().length());
                else eq = tview.getText().toString();


                if(lastChar == 47 || lastChar == 45 || lastChar == 43 || lastChar == 42)
                    tview.setText(tview.getText().subSequence(0, tview.getText().length() - 1));
                else if(eq.contains("*") || eq.contains("/") || eq.contains("+")||eq.contains("-"))
                    equalz(tview.getText());
                tview.setText(String.format("%s+", tview.getText()));
            }
        });

        /*
        Listener for multiplication button press. This listener concatenates the multiplication operand to the
        current input if possible. If the most recent char is an operand the button replaces the
        character with the multiplication operator. If there is already a valid equation in the input that
         equation is first equated and the answer is then followed by the multiplication operator.
        */
        mult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(cleared) cleared = false;
                int lastChar = tview.getText().charAt(tview.getText().length()-1);
                int firstChar = tview.getText().charAt(0);
                String eq;
                if(firstChar == 45)
                    eq = tview.getText().toString().substring(1, tview.getText().length());
                else eq = tview.getText().toString();
                if(lastChar == 47 || lastChar == 45 || lastChar == 43 || lastChar == 42)
                    tview.setText(tview.getText().subSequence(0, tview.getText().length() - 1));
                else if(eq.contains("*") || eq.contains("/") || eq.contains("+")||eq.contains("-"))
                    equalz(tview.getText());
                tview.setText(String.format("%s*", tview.getText()));
            }
        });

        /*
        Listener for invert button press. This listener concatenates the current answer after "1 / "
        if possible. If the most recent char is an operand the button replaces the
        character with the this inversion. If there is already a valid equation in the input that
         equation is first equated and the answer is then inverted.
        */
        inv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(cleared) cleared = false;
                int lastChar = tview.getText().charAt(tview.getText().length()-1);
                int firstChar = tview.getText().charAt(0);
                String eq;
                if(firstChar == 45)
                    eq = tview.getText().toString().substring(1, tview.getText().length());
                else eq = tview.getText().toString();
                if(lastChar == 47 || lastChar == 45 || lastChar == 43 || lastChar == 42)
                    tview.setText(tview.getText().subSequence(0, tview.getText().length() - 1));
                else if(eq.contains("*") || eq.contains("/") || eq.contains("+")||eq.contains("-"))
                    equalz(tview.getText());
                tview.setText(String.format("1/%s", tview.getText()));
            }
        });

        /*
        Listener for decimal button press. This listener concatenates a decimal to the
        current input if possible. If the most recent char is an operand the button adds zero before the decimal placement.
        */
        decimal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!percentage) {
                    if (!tview.getText().toString().contains(".")) {
                        if (cleared) cleared = false;
                        int lastChar = tview.getText().charAt(tview.getText().length() - 1);
                        if (lastChar == 47 || lastChar == 45 || lastChar == 43 || lastChar == 42)
                            tview.setText(String.format("%s0.", tview.getText()));
                        else tview.setText(String.format("%s.", tview.getText()));
                    }
                }
            }
        });

        //Listener for equal button press. This listener attempts to call the equalz() method with current input.
        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CharSequence equation = tview.getText();
                equalz(equation);
            }
        });

        /*
        Listener for the square root button press. This listener takes the square root of the
        current input if possible. Does nothing if the input is not a single number.
        */
        sqrtt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double ans;
                String num = tview.getText().toString();
                if(!num.contains("*") && !num.contains("/") && !num.contains("+")&& !num.contains("-")) {
                    ans = Math.sqrt(Double.parseDouble(num));
                    if (Math.floor(ans) == ans)
                        tview.setText(Double.toString(ans).substring(0, Double.toString(ans).length() - 2));
                    else tview.setText(Double.toString(ans));
                }
            }
        });

        /*
        Listener for the negate button press. This listener takes the current input and multiplies
        it by negative one if possible. Does nothing if the input is not a single number or zero.
        */
        flip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int firstChar = tview.getText().charAt(0);
                String num;
                if(firstChar == 45)
                    num = tview.getText().toString().substring(1, tview.getText().length());
                else num = tview.getText().toString();
                if(!num.contains("*") && !num.contains("/") && !num.contains("+")&& !num.contains("-")) {
                    if (firstChar == 45) tview.setText(num);
                    else if (Double.parseDouble(num) != 0.0)
                        tview.setText(String.format("-%s", tview.getText()));
                    else if(Double.parseDouble(num) == 0.0)
                        view.performHapticFeedback(HapticFeedbackConstants.LONG_PRESS);
                }
            }
        });

        /*
        Listener for the undo button press. This listener takes the current input and removes
        the last character. If there is only one character at the time a zero replaces the input.
        */
        undo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    percentage = false;
                if(tview.getText().length() == 1){
                        tview.setText("0");
                        cleared = true;
                    }else
                    tview.setText(tview.getText().toString().substring(0, tview.getText().length() - 1));
            }
        });

        /*
        Listener for the percent button press. This listener takes the current input and concatenates
        the percent operator onto the end. This is only possible if there is already an operator in
        the input. This takes the percentage placed after the operator of the first number in the
        equation and replaces the second number as such. Example: 40 * 50% is equivalent to 40 * 20.
        */
        percent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CharSequence equation = tview.getText();
                if((equation.toString().contains("/") || equation.toString().contains("*") || equation.toString().contains("+") || equation.toString().substring(1,equation.length()).contains("-"))&& !equation.toString().contains("%")){
                    int lastChar = tview.getText().charAt(tview.getText().length()-1);
                    if(lastChar == 47 || lastChar == 45 || lastChar == 43 || lastChar == 42){
                        tview.setText(String.format("%s0%%", tview.getText()));
                        percentage = true;
                    }else{
                        tview.setText(String.format("%s%%", tview.getText()));
                        percentage = true;
                    }
                }
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    //Method: equalz takes the given char sequence and turns it into a solvable equation.
    //Input: CharSequence equation - the math equation before being translated into calculable terms.
    //Returns: void - the tview is updated accordingly displaying the answer for the user to see.
private void equalz(CharSequence equation){
    String[] halves;
    double ans = 0.1;
    boolean perc = false;
    percentage= false;
    int lastChar = tview.getText().charAt(tview.getText().length()-1);
    if(lastChar == 37){
        equation = equation.subSequence(0,equation.length()-1);
        perc = true;
    }
    if(equation.toString().contains("/")){
        halves = equation.toString().split("/");
        if(halves.length != 1) {
            if(!perc) ans = Double.parseDouble(halves[0]) / Double.parseDouble(halves[1]);
            else
                ans = Double.parseDouble(halves[0]) / (Double.parseDouble(halves[0]) * (Double.parseDouble(halves[1]) / 100));
            tview.setText(Double.toString(ans));
        }
    }else if(equation.toString().contains("*")){
        halves = equation.toString().split("\\*");

        if(halves.length != 1) {
            if(!perc) ans = Double.parseDouble(halves[0]) * Double.parseDouble(halves[1]);
            else
                ans = Double.parseDouble(halves[0]) * (Double.parseDouble(halves[0]) * (Double.parseDouble(halves[1]) / 100));

            tview.setText(Double.toString(ans));
        }
    }else if(equation.toString().contains("+")){
        halves = equation.toString().split("\\+");
        if(halves.length != 1) {
            if(!perc) ans = Double.parseDouble(halves[0]) + Double.parseDouble(halves[1]);
            else
                ans = Double.parseDouble(halves[0]) + (Double.parseDouble(halves[0]) * (Double.parseDouble(halves[1]) / 100));

            tview.setText(Double.toString(ans));
        }
    }else if(equation.toString().contains("-")) {
        halves = equation.toString().split("\\-");
        if(halves.length == 2 && !halves[0].equals("")) {
            if(!perc) ans = Double.parseDouble(halves[0]) - Double.parseDouble(halves[1]);
            else
                ans = Double.parseDouble(halves[0]) - (Double.parseDouble(halves[0]) * (Double.parseDouble(halves[1]) / 100));

                tview.setText(Double.toString(ans));
        }else if(halves.length == 3){
                ans = -Double.parseDouble(halves[1]) - Double.parseDouble(halves[2]);
            if(!perc) ans = -Double.parseDouble(halves[1]) - Double.parseDouble(halves[2]);
            else{ans = -Double.parseDouble(halves[1]) - (Double.parseDouble(halves[1])*(Double.parseDouble(halves[2])/ 100));}
                tview.setText(Double.toString(ans));
        }
    }
    //Max int problem fix.
    if(Math.floor(ans) == ans && ans < 2147483647 && ans > -2147483647)
        tview.setText(Integer.toString((int) ans));
}
}
