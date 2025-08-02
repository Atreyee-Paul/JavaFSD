import React from 'react';

const CourseDetails = ({ courses }) => {
  return (
    <div>
      {courses.map((course, index) => (
        <div key={index}>
          <h2>{course.name}</h2>
          <h4>{course.date}</h4>
        </div>
      ))}
    </div>
  );
};

export default CourseDetails;
