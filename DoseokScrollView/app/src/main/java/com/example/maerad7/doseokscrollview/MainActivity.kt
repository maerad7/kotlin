package com.example.maerad7.doseokscrollview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var content="공 지능이라는 개념은 1956년 미국 다트머스 대학에 있던 존 매카시 교수가 개최한 다트머스 회의에서 처음 등장했으며, 최근 몇 년 사이 폭발적으로 성장하고 있는 중이랍니다. 특히 2015년 이후 신속하고 강력한 병렬 처리 성능을 제공하는 GPU의 도입으로 더욱 가속화되고 있죠. 갈수록 폭발적으로 늘어나고 있는 저장 용량과 이미지, 텍스트, 매핑 데이터 등 모든 영역의 데이터가 범람하게 된 ‘빅데이터’ 시대의 도래도 이러한 성장세에 큰 영향을 미쳤습니다.\n" +
                "\n" +
                "인공 지능: 인간의 지능을 기계로 구현하다\n" +
                "\n" +
                "\n" +
                "\n" +
                "1956년 당시 인공 지능의 선구자들이 꿈꾼 것은 최종적으로 인간의 지능과 유사한 특성을 가진 복잡한 컴퓨터를 제작하는 것이었죠. 이렇듯 인간의 감각, 사고력을 지닌 채 인간처럼 생각하는 인공 지능을 ‘일반 AI(General AI)’라고 하지만, 현재의 기술 발전 수준에서 만들 수 있는 인공지능은 ‘좁은 AI(Narrow AI)’의 개념에 포함됩니다. 좁은 AI는 소셜 미디어의 이미지 분류 서비스나 얼굴 인식 기능 등과 같이 특정 작업을 인간 이상의 능력으로 해낼 수 있는 것이 특징이죠.\n" +
                "\n" +
                "머신 러닝: 인공 지능을 구현하는 구체적 접근 방식\n" +
                "\n" +
                "공 지능이라는 개념은 1956년 미국 다트머스 대학에 있던 존 매카시 교수가 개최한 다트머스 회의에서 처음 등장했으며, 최근 몇 년 사이 폭발적으로 성장하고 있는 중이랍니다. 특히 2015년 이후 신속하고 강력한 병렬 처리 성능을 제공하는 GPU의 도입으로 더욱 가속화되고 있죠. 갈수록 폭발적으로 늘어나고 있는 저장 용량과 이미지, 텍스트, 매핑 데이터 등 모든 영역의 데이터가 범람하게 된 ‘빅데이터’ 시대의 도래도 이러한 성장세에 큰 영향을 미쳤습니다.\n" +
                "\n" +
                "인공 지능: 인간의 지능을 기계로 구현하다\n" +
                "\n" +
                "\n" +
                "\n" +
                "1956년 당시 인공 지능의 선구자들이 꿈꾼 것은 최종적으로 인간의 지능과 유사한 특성을 가진 복잡한 컴퓨터를 제작하는 것이었죠. 이렇듯 인간의 감각, 사고력을 지닌 채 인간처럼 생각하는 인공 지능을 ‘일반 AI(General AI)’라고 하지만, 현재의 기술 발전 수준에서 만들 수 있는 인공지능은 ‘좁은 AI(Narrow AI)’의 개념에 포함됩니다. 좁은 AI는 소셜 미디어의 이미지 분류 서비스나 얼굴 인식 기능 등과 같이 특정 작업을 인간 이상의 능력으로 해낼 수 있는 것이 특징이죠.\n" +
                "\n" +
                "머신 러닝: 인공 지능을 구현하는 구체적 접근 방식\n" +
                "\n"
        textView_content.setText(content)
    }
}
