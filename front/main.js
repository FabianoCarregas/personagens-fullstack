const postslist = document.querySelector('.posts-list');

const url ='https://heroes-fab.herokuapp.com/characters';

fetch(url)
.then(res => res.json())
.then(data => {
    data.forEach(post => {
        console.log(post);
    })
})