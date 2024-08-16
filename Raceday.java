let raceNumber = Math.floor(Math.random() * 1000);
const registeredEarly = true;
let runnerAge = 18;
if(runnerAge > 18 && registeredEarly){
  raceNumber += 1000;
}if(runnerAge > 18 && registeredEarly){
  console.log(`${raceNumber} will race in 9:30 am`);
}else if(runnerAge>18 && !registeredEarly){
  console.log( `${raceNumber} will race at 11:00 am`);
}else if(runnerAge<=18){
  console.log(`${raceNumber} run at 12:30pm`);
}
