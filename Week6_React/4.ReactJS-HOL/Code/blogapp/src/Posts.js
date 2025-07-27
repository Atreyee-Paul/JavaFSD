// src/Posts.js
import React from 'react';
import Post from './Post';

class Posts extends React.Component {
  constructor(props) {
    super(props);
    this.state = {
      posts: [],
      hasError: false
    };
  }

  loadPosts() {
    fetch('https://jsonplaceholder.typicode.com/posts')
      .then(response => response.json())
      .then(data => {
        const postObjects = data.map(p => new Post(p.id, p.title, p.body));
        this.setState({ posts: postObjects });
      })
      .catch(error => {
        this.setState({ hasError: true });
        console.error("Fetch Error:", error);
      });
  }

  componentDidMount() {
    this.loadPosts();
  }

  componentDidCatch(error, info) {
    alert("An error occurred in the Posts component.");
    console.error("Error info:", error, info);
  }

  render() {
    const { posts } = this.state;

    return (
      <div>
        <h1>Posts</h1>
        {posts.map(post => (
          <div key={post.id}>
            <h2>{post.title}</h2>
            <p>{post.body}</p>
          </div>
        ))}
      </div>
    );
  }
}

export default Posts;