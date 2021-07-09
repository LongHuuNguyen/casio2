package com.example.casio2

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import net.objecthunter.exp4j.ExpressionBuilder

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // tim nut bam bang id
        var edt = findViewById<TextView>(R.id.edt)
        var tview = findViewById<TextView>(R.id.tview)
        // biến màn hình
        // lấy giá trị trong biến màn hình , chuyển qua kiểu string
        val nine = findViewById<Button>(R.id.chin)
        val eight = findViewById<Button>(R.id.tam)
        val seven = findViewById<Button>(R.id.bay)
        val six = findViewById<Button>(R.id.sau)
        val five = findViewById<Button>(R.id.nam)
        val four = findViewById<Button>(R.id.bon)
        val three = findViewById<Button>(R.id.ba)
        val two = findViewById<Button>(R.id.hai)
        val one = findViewById<Button>(R.id.mot)
        val zero = findViewById<Button>(R.id.khong)
        val cham = findViewById<Button>(R.id.cham)
        val bang = findViewById<Button>(R.id.bang)
        val xoa = findViewById<Button>(R.id.xoa)
        val nhan = findViewById<Button>(R.id.nhan)
        val chia = findViewById<Button>(R.id.chia)
        val cong = findViewById<Button>(R.id.cong)
        val tru = findViewById<Button>(R.id.tru)

        // khi kích dô nút số chín thì test hiện lên màn hình
        //
        nine.setOnClickListener {
            val a= edt.text.toString() + "9"
            // 67
            // 679
            //set text để  cho hén đẩy kết quả lên
            edt.setText(a)

        }
        eight.setOnClickListener {
            val a= edt.text.toString() + "8"
            edt.setText(a)
        }
        seven.setOnClickListener {
            val a= edt.text.toString() + "7"
            edt.setText(a)
        }
        six.setOnClickListener {
            val a= edt.text.toString() + "6"
            edt.setText(a)
        }
        five.setOnClickListener {
            val a= edt.text.toString() + "5"
            edt.setText(a)
        }
        four.setOnClickListener {
            val a= edt.text.toString() + "4"
            edt.setText(a)
        }
        three.setOnClickListener {
            val a= edt.text.toString() + "3"
            edt.setText(a)
        }
        two.setOnClickListener {
            val a= edt.text.toString() + "2"
            edt.setText(a)
        }
        one.setOnClickListener {
            val a= edt.text.toString() + "1"
            edt.setText(a)
        }
        zero.setOnClickListener {
            val a= edt.text.toString() + "0"
            edt.setText(a)
        }
        cham.setOnClickListener {
            val a= edt.text.toString() + "."
            edt.setText(a)
        }
        xoa.setOnClickListener {

            edt.setText("")
        }
        nhan.setOnClickListener {
            val a= edt.text.toString() + "*"
            edt.setText(a)
        }
        cong.setOnClickListener {
            val a= edt.text.toString() + "+"
            edt.setText(a)
        }
        tru.setOnClickListener {
            val a= edt.text.toString() + "-"
            edt.setText(a)
        }
        chia.setOnClickListener {
            val a= edt.text.toString() + "/"
            edt.setText(a)
        }
        // cài thêm 1 cái pakege hổ trợ đứa ra kết quả từ chuổi
        // "5667+565+234*5445" => kêt quả



        bang.setOnClickListener {

            try {

                val input = ExpressionBuilder(edt.text.toString()).build() // lấy giá trị
                val output = input.evaluate() // tính
                val longOutput = output.toLong()// to long
                Log.e("aaa", longOutput.toString())
                if (output == longOutput.toDouble()){
                    tview.setText( longOutput.toString())
                }else{
                    tview.setText ( output.toString())
                }

            }catch (e:Exception){
                Toast.makeText(this@MainActivity,e.message, Toast.LENGTH_LONG).show()
            }
        }





    }




}