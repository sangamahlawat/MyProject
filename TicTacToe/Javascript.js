let boxes=document.querySelectorAll(".box");
let reset=document.querySelector("#Reset");
let newbtn=document.querySelector("#new-btn");
let msg=document.querySelector("#msg");
let msgcontainer=document.querySelector(".msg-container");
let hide=document.querySelector(".hide");
let turn0=true;


const winPattern=[[0,1,2],[0,3,6],[0,4,8],[1,4,7],[2,5,8],[2,4,6],[3,4,5],[6,7,8]];
const resetGame = () => {
    turn0=true;
    enableboxes();
    hide.classList.add("hide");
};
boxes.forEach((box) => 
{

    box.addEventListener("click", ()=>{
        console.log("box was clicked")
     if(turn0){
        box.innerText="O";
        turn0=false;
     }
     else
     {
        box.innerText="X";
        turn0=true;
     }
     box.disabled=true;
     checkwinner();
    });
});
const disabledboxes=()=>{
    for (let box of boxes) {
        box.disabled=true;
    }
};
const enableboxes=()=>{
    for (let box of boxes) {
        box.disabled=false;
        box.innerText=" ";
    }
};
const showWinner=(winner)=>{

    msg.innerText=`Congratulation ${winner} you win`;
    hide.classList.remove("hide")
    disabledboxes();
}
const checkwinner = ()=>{
    for (let pattern of winPattern) {
        let posval1 = boxes[pattern[0]].innerText;
        
        let posval2 = boxes[pattern[1]].innerText;
        
        let posval3= boxes[pattern[2]].innerText;        
    
    if(posval1  !=  ""   && posval2  !=""   &&  posval3  !=  "")
    {
        if(posval1 === posval2  &&  posval2 === posval3)
        {
            console.log("winner" , posval1);
            showWinner(posval1);
        }
    }
}
}
newbtn.addEventListener("click", resetGame);
reset.addEventListener("click", resetGame);
