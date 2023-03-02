package huyhl.hcmute.edu.vn.mycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private Button b_no1;
    private Button b_no2;
    private Button b_no3;
    private Button b_no4;
    private Button b_no5;
    private Button b_no6;
    private Button b_no7;
    private Button b_no8;
    private Button b_no9;
    private Button b_no0;
    private Button b_clean;
    private Button b_cleanAll;
    private Button b_sub;
    private Button b_div;
    private Button b_add;
    private Button b_mul;
    private Button b_equals;
    private Button b_point;
    private Button b_percent;
    private TextView txtView;
    private double val1 = 0;
    private double val2 = 0;
    private double result;
    private boolean state;
    private boolean state_dot;
    private boolean state_add;
    private boolean state_sub;
    private boolean state_mul;
    private boolean state_div;
    private boolean state_percent;
    private int count;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewSetup();
        reset();

        b_no0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(state == true)
                {
                    val1 = val1 * 10;
                    if (state_dot == true)
                        count += 1;
                }
                else
                {
                    val2 = val2 * 10;
                    if(state_dot == true)
                        count += 1;
                }
                txtView.setText(txtView.getText().toString() + "0");
            }
        });

        b_no1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(state == true)
                {
                    if(state_dot == true)
                    {
                        val1 = val1 + Math.pow(10, -count);
                        count += 1;
                    }
                    else { val1 = val1 * 10 + 1; }
                }

                if(state == false)
                {
                    if(state_dot == true)
                    {
                        val2 = val2 + Math.pow(10, -count);
                        count += 1;
                    }
                    else { val2 = val2 * 10 + 1; }
                }
                txtView.setText(txtView.getText().toString() + "1");
            }
        });

        b_no2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(state == true)
                {
                    if(state_dot == true)
                    {
                        val1 = val1 + Math.pow(10, -count) * 2;
                        count += 1;
                    }
                    else { val1 = val1 * 10 + 2; }
                }

                if(state == false)
                {
                    if(state_dot == true)
                    {
                        val2 = val2 + Math.pow(10, -count) * 2;
                        count += 1;
                    }
                    else { val2 = val2 * 10 + 2; }
                }
                txtView.setText(txtView.getText().toString() + "2");
            }
        });

        b_no3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(state == true)
                {
                    if(state_dot == true)
                    {
                        val1 = val1 + Math.pow(10, -count) * 3;
                        count += 1;
                    }
                    else { val1 = val1 * 10 + 3; }
                }

                if(state == false)
                {
                    if(state_dot == true)
                    {
                        val2 = val2 + Math.pow(10, -count) * 3;
                        count += 1;
                    }
                    else { val2 = val2 * 10 + 3; }
                }
                txtView.setText(txtView.getText().toString() + "3");
            }
        });

        b_no4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(state == true)
                {
                    if(state_dot == true)
                    {
                        val1 = val1 + Math.pow(10, -count) * 4;
                        count += 1;
                    }
                    else { val1 = val1 * 10 + 4; }
                }

                if(state == false)
                {
                    if(state_dot == true)
                    {
                        val2 = val2 + Math.pow(10, -count) * 4;
                        count += 1;
                    }
                    else { val2 = val2 * 10 + 4; }
                }
                txtView.setText(txtView.getText().toString() + "4");
            }
        });

        b_no5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(state == true)
                {
                    if(state_dot == true)
                    {
                        val1 = val1 + Math.pow(10, -count) * 5;
                        count += 1;
                    }
                    else { val1 = val1 * 10 + 5; }
                }

                if(state == false)
                {
                    if(state_dot == true)
                    {
                        val2 = val2 + Math.pow(10, -count) * 5;
                        count += 1;
                    }
                    else { val2 = val2 * 10 + 5; }
                }
                txtView.setText(txtView.getText().toString() + "5");
            }
        });

        b_no6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(state == true)
                {
                    if(state_dot == true)
                    {
                        val1 = val1 + Math.pow(10, -count) * 6;
                        count += 1;
                    }
                    else { val1 = val1 * 10 + 6; }
                }

                if(state == false)
                {
                    if(state_dot == true)
                    {
                        val2 = val2 + Math.pow(10, -count) * 6;
                        count += 1;
                    }
                    else { val2 = val2 * 10 + 6; }
                }
                txtView.setText(txtView.getText().toString() + "6");
            }
        });

        b_no7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(state == true)
                {
                    if(state_dot == true)
                    {
                        val1 = val1 + Math.pow(10, -count) * 7;
                        count += 1;
                    }
                    else { val1 = val1 * 10 + 7; }
                }

                if(state == false)
                {
                    if(state_dot == true)
                    {
                        val2 = val2 + Math.pow(10, -count) * 7;
                        count += 1;
                    }
                    else { val2 = val2 * 10 + 7; }
                }
                txtView.setText(txtView.getText().toString() + "7");
            }
        });

        b_no8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(state == true)
                {
                    if(state_dot == true)
                    {
                        val1 = val1 + Math.pow(10, -count) * 8;
                        count += 1;
                    }
                    else { val1 = val1 * 10 + 8; }
                }

                if(state == false)
                {
                    if(state_dot == true)
                    {
                        val2 = val2 + Math.pow(10, -count) * 8;
                        count += 1;
                    }
                    else { val2 = val2 * 10 + 8; }
                }
                txtView.setText(txtView.getText().toString() + "8");
            }
        });

        b_no9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(state == true)
                {
                    if(state_dot == true)
                    {
                        val1 = val1 + Math.pow(10, -count) * 9;
                        count += 1;
                    }
                    else { val1 = val1 * 10 + 9; }
                }

                if(state == false)
                {
                    if(state_dot == true)
                    {
                        val2 = val2 + Math.pow(10, -count) * 9;
                        count += 1;
                    }
                    else { val2 = val2 * 10 + 9; }
                }
                txtView.setText(txtView.getText().toString() + "9");
            }
        });

        b_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operation(1);
                operation(2);
                txtView.setText(txtView.getText().toString() + "+");
            }
        });

        b_sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operation(1);
                operation(3);
                txtView.setText(txtView.getText().toString() + "-");
            }
        });

        b_mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operation(1);
                operation(4);
                txtView.setText(txtView.getText().toString() + "*");
            }
        });

        b_div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operation(1);
                operation(5);
                txtView.setText(txtView.getText().toString() + "/");
            }
        });

        b_point.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operation(6);
                txtView.setText(txtView.getText().toString() + ".");

            }
        });

        b_percent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtView.setText(txtView.getText().toString() + "%");
                if(state)
                    val1 = val1 / 100;
                else
                    val2 = val2 / 100;
                state_percent = false;
            }
        });

        b_equals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculate();
            }
        });

        b_clean.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resetScreen();
                if(state == true)
                {
                    val1 = val1 / 10 - ((val1 % 10) / 10);
                    show_string_after_processing(val1);
                    if(state_percent == true)
                        txtView.setText(txtView.getText().toString() + "%");
                }
                else
                {
                    val2 = val2 / 10 - ((val2 % 10) / 10);
                    show_string_after_processing(val1);
                    if(state_add) { txtView.setText(txtView.getText().toString() + "+"); }
                    if(state_sub) { txtView.setText(txtView.getText().toString() + "-"); }
                    if(state_mul) { txtView.setText(txtView.getText().toString() + "*"); }
                    if(state_div) { txtView.setText(txtView.getText().toString() + "/"); }
                    show_string_after_processing(val2);
                }
            }
        });

        b_cleanAll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resetScreen();
                reset();
            }
        });
    }

    private void viewSetup()
    {
        b_no0 = findViewById(R.id.no0);
        b_no1 = findViewById(R.id.no1);
        b_no2 = findViewById(R.id.no2);
        b_no3 = findViewById(R.id.no3);
        b_no4 = findViewById(R.id.no4);
        b_no5 = findViewById(R.id.no5);
        b_no6 = findViewById(R.id.no6);
        b_no7 = findViewById(R.id.no7);
        b_no8 = findViewById(R.id.no8);
        b_no9 = findViewById(R.id.no9);
        b_clean = findViewById(R.id.clean);
        b_cleanAll = findViewById(R.id.cleanAll);
        b_sub = findViewById(R.id.sub);
        b_div = findViewById(R.id.div);
        b_add = findViewById(R.id.add);
        b_mul = findViewById(R.id.mul);
        b_equals = findViewById(R.id.equal);
        b_point = findViewById(R.id.point);
        b_percent = findViewById(R.id.percent);
        txtView = findViewById(R.id.result);
    }


    private void calculate() {
        resetScreen();
        if (state_add)
            result = val1 + val2;
        if (state_sub)
            result = val1 - val2;
        if (state_mul)
            result = val1 * val2;
        if (state_div)
            result = val1 % val2;
        show_string_after_processing(result);
    }
    private void show_string_after_processing(double element)
    {
        String str;
        int compare = Double.valueOf(element).intValue();
        if(compare != element)
            str = String.format("%.8f", element);
        else
            str = "" + compare;
        txtView.setText(txtView.getText().toString() + str);
    }

    private void operation(int mode){
        switch (mode) {
            case 1:
                if(state)
                    state = false;
                else
                    state = true;
                break;
            case 2:
                state_add = true;
                state_dot = false;
                state_percent = false;
                break;
            case 3:
                state_sub = true;
                state_dot = false;
                state_percent = false;
                break;
            case 4:
                state_mul = true;
                state_dot = false;
                state_percent = false;
                break;
            case 5:
                state_div = true;
                state_dot = false;
                state_percent = false;
                break;
            case 6:
                state_dot = true;
                count = 1;
                break;
            case 7:
                state_percent = true;
                break;
        }
        if (state_add == true)
        {
            state_sub = false;
            state_mul = false;
            state_div = false;
        }
        if (state_sub == true)
        {
            state_add = false;
            state_mul = false;
            state_div = false;
        }
        if (state_mul == true)
        {
            state_add = false;
            state_sub = false;
            state_div = false;
        }
        if (state_div == true)
        {
            state_add = false;
            state_sub = false;
            state_mul = false;
        }
    }

    private void reset()
    {
        state = true;
        state_dot = false;
        state_add = false;
        state_sub = false;
        state_mul = false;
        state_div = false;
        state_percent = false;
        count = 1;
        val1 = 0;
        val2 = 0;
        result = 0;
    }
    private void resetScreen() { txtView.setText(""); }
}