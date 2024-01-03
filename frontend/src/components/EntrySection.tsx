interface EntryProps {
  title: string;
  text: string[];
}

export default function EntrySection({ title, text }: EntryProps) {
  return (
    <>
      <h2>{title}</h2>

      {text.map((line) => (
        <ul>{line}</ul>
      ))}
    </>
  );
}
