import React from "react";

function Header() {
  return (
    <header className="header">
      <h1>My Personal Blog</h1>
      <p>A glimpse into my academic journey and career goals</p>
    </header>
  );
}

function PersonalInfo({ name, description }) {
  return (
    <section className="section">
      <h2>Personal Information</h2>
      <p><strong>Name:</strong> {name}</p>
      <p>{description}</p>
    </section>
  );
}

function AcademicQualifications({ qualifications }) {
  return (
    <section className="section">
      <h2>Academic Qualifications</h2>
      <ul>
        {qualifications.map((q, index) => (
          <li key={index}>
            {q.degree} – {q.institution} ({q.year})
          </li>
        ))}
      </ul>
    </section>
  );
}

function Expertise({ skills }) {
  return (
    <section className="section">
      <h2>Areas of Expertise</h2>
      <ul>
        {skills.map((skill, index) => (
          <li key={index}>{skill}</li>
        ))}
      </ul>
    </section>
  );
}

function FutureCareer({ field }) {
  return (
    <section className="section">
      <h2>Future Career Interest</h2>
      <p>{field}</p>
    </section>
  );
}

function App() {
  const qualifications = [
    {
      degree: "Bachelor of Technology",
      institution: "XYZ University",
      year: "2024",
    },
    {
      degree: "Higher Secondary Education",
      institution: "ABC College",
      year: "2020",
    },
  ];

  const skills = [
    "Web Development",
    "React.js",
    "JavaScript",
    "Machine Learning",
  ];

  return (
    <div className="container">
      <Header />

      <PersonalInfo
        name="Your Name"
        description="I am a passionate learner interested in modern web technologies and software development."
      />

      <AcademicQualifications qualifications={qualifications} />

      <Expertise skills={skills} />

      <FutureCareer field="I aspire to work as a Full Stack Developer in the tech industry." />

      {/* CSS */}
      <style>{`
        body {
          margin: 0;
          font-family: Arial, Helvetica, sans-serif;
          background-color: #f4f6f8;
        }

        .container {
          max-width: 800px;
          margin: auto;
          padding: 20px;
        }

        .header {
          text-align: center;
          background-color: #2c3e50;
          color: white;
          padding: 20px;
          border-radius: 8px;
        }

        .section {
          background: white;
          margin-top: 20px;
          padding: 20px;
          border-radius: 8px;
          box-shadow: 0 2px 5px rgba(0,0,0,0.1);
        }

        h2 {
          color: #2c3e50;
        }

        ul {
          padding-left: 20px;
        }

        li {
          margin-bottom: 8px;
        }
      `}</style>
    </div>
  );
}

export default App;