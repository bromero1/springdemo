import EntrySection from "../components/EntrySection";

export default function JournalEntry() {
  return (
    <>
      <div>Daily Journal</div>
      <EntrySection
        title={"Title"}
        text={["I'm not sure", "This is an example"]}
      />
    </>
  );
}
