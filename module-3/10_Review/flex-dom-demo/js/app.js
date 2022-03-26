let cat = null;
let ben = null;
let quiet = true;
let studentsAdded = false;

const students = ['Danilo', 'Kevin', 'Patti', 'Kieta', 'Andrew',
'Jay', 'Jacob', 'Cedric', 'Donny', 'Kyle', 'Dan',
'Payton', 'Mikey', 'Kate', 'Nick E.', 'Elias',
'Grayson', 'Angel', 'Nick S.'];

let inRoom = ['Ben'];

const instructors = ['Ben', 'David', 'Tori', 'Kaitlin'];

document.addEventListener('DOMContentLoaded', () => {
    const addAnother = document.getElementById('addLI');
    cat = document.getElementById('mover');
    ben = document.getElementById('headHoncho');
    main = document.querySelector('main');
    inRoom = [];
    
    const btnAddStudents = document.getElementById('btnAddStudents');
    btnAddStudents.addEventListener('click', () => {
        addJavaStudentsToList();
    })

    addAnother.addEventListener('click', () => {
        const addDiv = document.getElementById('listAddDiv');
        addDiv.classList.remove('d-none');
        const addBtn = addDiv.querySelector('button');
        addBtn.addEventListener('click', addNameToList);
    });

    document.addEventListener('mousemove', (event) => {
        if (!quiet) {
            cat.style.left = event.pageX+4 + 'px';
            cat.style.top = event.pageY+4 + 'px';
            cat.style.transform = 'rotate('+((event.pageX-event.pageY) % 50)+'deg';
        }
    });
    
    ben.addEventListener('click', (event) => { quiet = !quiet; });
});    

function addNameToList() {
    const fname = document.getElementById('fname').value;
    const theList = document.getElementById('classroom');
    if (fname == 'Tasha') {
        alert('Wonderful! Tasha is always welcome.');
        quiet = false;
        const tasha = document.getElementById('mover');
        tasha.style.visibility = 'visible';
    } 
    else if (fname == 'Ruthie') {
        alert('Sorry! Tasha is the only cat allowed in the classroom.');
    } 
    else if (fname == 'Jerry') {
        alert('Sorry! Dogs are too noisy for the classroom.');
    } 
    else if (inRoom.includes(fname)) {
        alert(fname+' is already in the classroom. Pay attention!')
    }
    else if (fname == 'John Savage' || fname == 'John') {
        const theOther = document.createElement('li');
        theOther.setAttribute('class', 'campusDirector');
        theOther.innerHTML = '<center><em>John<br />Savage</em></center>';
        theList.appendChild(theOther);
        inRoom.push(fname);
    }
    else {
        const theOther = document.createElement('li');
        if (instructors.includes(fname)) {
            theOther.setAttribute('class', 'instructor');
        }
        theOther.innerText = fname;
        theList.appendChild(theOther);
        inRoom.push(fname);        
    }
    const addDiv = document.getElementById('listAddDiv');
    addDiv.classList.add('d-none');
}

function addJavaStudentsToList() {
    if (studentsAdded) {
        alert('The classroom is already full of students. Start teaching!');
    }
    else {
        const theList = document.getElementById('classroom');

        students.forEach((student) => {
            if (!inRoom.includes(student)) {
                const theOther = document.createElement('li');
                theOther.innerText = student;
                theList.appendChild(theOther);
                inRoom.push(student);
            }
        });
        studentsAdded = true;
    }
}
      