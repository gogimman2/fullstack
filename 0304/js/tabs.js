const targetLink = document.querySelectorAll('.tab_menu li a');  // 탭버튼
const tabContent = document.querySelectorAll('#tabContent > div');  // 탭내용

targetLink.forEach(function(link){
    link.addEventListener('click', function(e){
        e.preventDefault();  // 링크금지
        let orgTarget = e.target.getAttribute('href');
        // 클릭한놈(e.target) - this로 변경가능
        // getAttribute 는 href, src 속성값을 읽어옴
        // alert(orgTarget); #tab1, #tab2, #tab3
        let tabTarget = orgTarget.replace("#", "");  // #tabs3 -> tabs3
        // #tab1 에서 #을 반문자계열로 대테 -> tab1
        // alert(tabTarget);
        tabContent.forEach(function(content){
            content.style.display = "none";
            // 클릭한 탭만 보이게 설정
        });
        document.getElementById(tabTarget).style.display = "block";
        targetLink.forEach(function(link2){
            link2.classList.remove('active');
        });
        e.target.classList.add('active');
    });
});