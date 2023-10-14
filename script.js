const API="012083bbd454f2afe86e85fec247f762"
const city = document.getElementById('searchs');






document.getElementById('searchb').addEventListener('click',(e)=>{

    e.preventDefault();
    console.log("woeked");
    let query = city.value.trim();
   
    fetch(`https://api.openweathermap.org/data/2.5/weather?q=${query}&appid=${API}&units=metric`)
            .then((res)=>  res.json())
            .then((data) =>{
                document.getElementById('icons').src = `http://openweathermap.org/img/wn/${data.weather[0].icon}.png`;33333
                document.getElementById('cityz').textContent = data.name;
                
                document.getElementById('temp').textContent = `Temperature: ${data.main.temp}°C`;
                document.getElementById('time').textContent = new Date().toLocaleTimeString('en-US');
            })
        
        

    
});