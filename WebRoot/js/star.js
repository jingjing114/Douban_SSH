window.onload=function ()
{
	var oDiv=document.getElementById('pingfen');
	var aLi=oDiv.getElementsByTagName('li');
	var op=oDiv.getElementsByTagName('p')[0];
	var arr=['很差(2)','较差(4)','一般(6)','推荐(8)','力荐(10)'];
	var score=document.getElementById("score");
	var i=0;
	for(i=0;i<aLi.length;i++)
	{
	aLi[i].index=i;
	aLi[i].onmouseover=function ()
	{
		op.style.display='block';
		for(i=0;i<=this.index;i++)
		{
			aLi[i].className='active';
		}
		op.innerHTML=arr[this.index];
	};
	aLi[i].onmouseout=function ()
	{
		op.style.display='none';
		for(i=0;i<aLi.length;i++)
		{
			aLi[i].className='';
		}
	};
	aLi[i].onclick=function ()
	{
		op.style.display='block';
		for(i=0;i<=this.index;i++)
		{
			aLi[i].className='active';
				
		}
		for(i=0;i<=4;i++)
			{
			aLi[i].onmouseout=function (){}
			aLi[i].onmouseover=function (){}
			}
		op.innerHTML=arr[this.index];
		score.value=(this.index+1.1)*2;
		//alert('评分成功'+','+score.value+'分');
	};
	}
};

function reloadpage()
{
	window.location.reload();
};