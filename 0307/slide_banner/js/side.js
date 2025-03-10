$(function(){
    var visual = $('#brandVisual > ul > li');
    var button = $('#buttonList > li');
    var current = 0;
    var id;
    var i = 0;

    button.click(function(){
        i = $(this).index();
        // alert(i);
        button.removeClass('on');
        button.eq(i).addClass('on')
        moveBy();
        return false;
    });
    function timer(){
        id = setInterval(function(){
            var n = current + 1
            if(n === 3) n = 0;
            button.eq(n).trigger('click');
            // n번째 보튼을 3초마다 강제로 클릭
    },3000);
    }
    function move(){
        if(current == i) return
    };
    var cu = visual.eq(current);
    var cu = visual.eq(i);
    cu.css('left', '0').stop().animate
})