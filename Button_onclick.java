//숫자 버튼들 전부를 onclick으로 코드 연결하기

public void numButtonClick(View view){
        Button button = findViewById(view.getId());
        String getButtonText = button.getText().toString();

        if(isFirstInput){
            activityMainBinding.resultTextView.setText(getButtonText);
            activityMainBinding.mathTextView.setText(getButtonText);
            isFirstInput = false;
        }else{
            activityMainBinding.resultTextView.append(getButtonText);
            activityMainBinding.mathTextView.append(getButtonText);
        }

//버튼 하나에 onclick으로 코드 연결하기
public void num1Click(View view){
        if(isFirstInput){
            activityMainBinding.resultTextView.setText("1");
            activityMainBinding.mathTextView.setText("1");
            isFirstInput = false;
        }else{
            activityMainBinding.resultTextView.append("1");
            activityMainBinding.mathTextView.append("1");
        }

    }

//tag를 사용하는 방법
public void numButtonClick(View view){
        String getButtonText = view.getTag().toString();
        if(isFirstInput){
            activityMainBinding.resultTextView.setText(getButtonText);
            activityMainBinding.mathTextView.setText(getButtonText);
            isFirstInput = false;
        }else{
            activityMainBinding.resultTextView.append(getButtonText);
            activityMainBinding.mathTextView.append(getButtonText);
        }

    }
